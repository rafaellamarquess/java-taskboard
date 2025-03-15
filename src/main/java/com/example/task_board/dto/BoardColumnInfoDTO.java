package com.example.task_board.dto;


import com.example.task_board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(
        Long id,
        int order,
        BoardColumnKindEnum kind) {
}