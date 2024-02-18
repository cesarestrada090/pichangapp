package com.confiedy.app.controller;
import com.confiedy.app.dto.CursoDTO;
import com.confiedy.app.dto.EvaluacionCursoDto;
import com.confiedy.app.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/app")
public class CursoController {
    private final CursoService cursoService;
    private static final Logger log = Logger.getLogger(CursoController.class.getName());
    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping(value="cursosPorAlumnoId")
    public ResponseEntity<List<CursoDTO>> getAll(
            @RequestParam(name = "alumnoId") int alumnoId){
        List<CursoDTO> cursoDTOS;
        try {
           cursoDTOS = cursoService.getCursosByAlumno(alumnoId);
        } catch (Exception e){
            log.info("Excepcion en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(cursoDTOS, HttpStatus.OK);
    }

    @GetMapping(value="evaluacionCurso/{cursoId}/{alumnoId}")
    public ResponseEntity<List<EvaluacionCursoDto>> getAllBy(
            @PathVariable(value = "cursoId") int cursoId, @PathVariable(value = "alumnoId") int alumnoId){
        List<EvaluacionCursoDto> evaluacionCursoDtos;
        try {
            evaluacionCursoDtos = cursoService.getEvaluacionesByCursoId(cursoId,alumnoId);
        } catch (Exception e){
            log.info("Excepcion en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(evaluacionCursoDtos, HttpStatus.OK);
    }

    @GetMapping(value="curso")
    public ResponseEntity<List<CursoDTO>> getAll(){
        try {
            List<CursoDTO> cursoDTOList = cursoService.getCursos();
            return ResponseEntity.ok(cursoDTOList);
        } catch (Exception e){
            log.info("Exception en: "+e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
