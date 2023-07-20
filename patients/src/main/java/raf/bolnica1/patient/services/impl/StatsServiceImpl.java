package raf.bolnica1.patient.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import raf.bolnica1.patient.domain.constants.Gender;
import raf.bolnica1.patient.domain.stats.CovidStats;
import raf.bolnica1.patient.dto.stats.CovidStatsResultDto;
import raf.bolnica1.patient.mapper.StatsMapper;
import raf.bolnica1.patient.repository.CovidStatsRepository;
import raf.bolnica1.patient.services.StatsService;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StatsServiceImpl implements StatsService {

    private CovidStatsRepository covidStatsRepository;
    private StatsMapper statsMapper;

    @Override
    public CovidStatsResultDto getCovidStats(int page, int size, Date startDate, Date endDate, Gender gender, int ageCategory) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("date"));

        List<CovidStats> covidStats = covidStatsRepository.findByRequests(startDate, endDate, gender, ageCategory);

        Page<CovidStats> covidStatsPage = new PageImpl<>(covidStats, pageable, covidStats.size());
        return statsMapper.mapCovidResult(covidStatsPage, pageable);
    }
}
