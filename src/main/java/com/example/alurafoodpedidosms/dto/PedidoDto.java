package com.example.alurafoodpedidosms.dto;

import com.example.alurafoodpedidosms.model.ItemDoPedido;
import com.example.alurafoodpedidosms.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private Long id;
    private LocalDateTime dataHora;
    private Status status;
    private List<ItemDoPedido> itens = new ArrayList<>();

}
