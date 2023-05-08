package com.example.demo.utils;

import com.example.demo.dto.ProgramaDto;
import com.example.demo.models.ProgramaModel;
import org.junit.jupiter.api.Test;

import static com.example.demo.utils.Factories.programaFactory;

import static org.junit.jupiter.api.Assertions.*;

class FactoriesTest {

    @Test
    public void convertsModelToDto() {
        // Arrange
        ProgramaModel model = new ProgramaModel();
        model.setDescripcion("Descripcion prueba");
        model.setId(123);
        model.setNombre("Nombre prueba");

        // Act
        ProgramaDto dto = programaFactory(model);

        // Assert
        assertEquals(model.getDescripcion(), dto.getDescripcion());
    }
}