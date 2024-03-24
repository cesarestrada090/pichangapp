package com.confiedy.app.service.impl;

import com.confiedy.app.entities.Championship;
import com.confiedy.app.repository.ChampionshipRepository;
import com.confiedy.app.service.ChampionshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionshipServiceImpl implements ChampionshipService {

    private final ChampionshipRepository championshipRepository;

    @Autowired
    public ChampionshipServiceImpl(ChampionshipRepository championshipRepository) {
        this.championshipRepository = championshipRepository;
    }

    @Override
    public Championship createChampionship(Championship championship) {
        return championshipRepository.save(championship);
    }

    @Override
    public List<Championship> findAllChampionships() {
        return championshipRepository.findAll();
    }

    @Override
    public Championship findChampionshipById(Integer id) {
        return championshipRepository.findById(id).orElse(null);
    }

    @Override
    public Championship updateChampionship(Championship championship) {
        return championshipRepository.save(championship);
    }

    @Override
    public void deleteChampionship(Integer id) {
        championshipRepository.deleteById(id);
    }

    // Implementación de métodos adicionales (búsqueda por capitán, rango de fechas, etc.)

}