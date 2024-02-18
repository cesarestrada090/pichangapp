package com.confiedy.app.service;


import com.confiedy.app.dto.CursoDTO;
import com.confiedy.app.dto.EvaluacionCursoDto;

import java.util.List;

public interface CursoService {
    List<CursoDTO> getCursosByAlumno(Integer alumnoId);

    List<EvaluacionCursoDto> getEvaluacionesByCursoId(Integer cursoId,Integer alumnoId);

    List<CursoDTO> getCursos();
}
