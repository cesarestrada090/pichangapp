package com.confiedy.app.service;

import com.confiedy.app.entities.Championship;

import java.util.List;

public interface ChampionshipService {

    Championship createChampionship(Championship championship);

    List<Championship> findAllChampionships();

    Championship findChampionshipById(Integer id);

    Championship updateChampionship(Championship championship);

    void deleteChampionship(Integer id);

    // Métodos adicionales (búsqueda por capitán, rango de fechas, etc.)
}
