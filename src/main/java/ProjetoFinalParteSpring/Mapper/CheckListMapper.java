package ProjetoFinalParteSpring.Mapper;

import ProjetoFinalParteSpring.Domain.CheckListEntity;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOLista;
import ProjetoFinalParteSpring.Domain.CheckListRespostaDTOPost;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CheckListMapper {

    @NotNull
    public List<CheckListRespostaDTOLista> transformaDto2(@NotNull final List<CheckListEntity> checkEntities) {
        return (List<CheckListRespostaDTOLista>) checkEntities.stream()
                .map(this::transformaDto)
                .collect(Collectors.toList());
    }

    public CheckListRespostaDTOLista transformaDto(CheckListEntity dto) {
        return CheckListRespostaDTOLista.builder()
                .data(dto.getData())
                .hora(dto.getHora())
                .saidaRetorno(dto.getSaidaRetorno())
                .placa(dto.getPlaca())
                .motorista(dto.getMotorista())
                .kmVeiculo(dto.getKmVeiculo())
                .build();
    }

    public CheckListRespostaDTOPost transformaDto3(CheckListEntity entity) {
        return CheckListRespostaDTOPost.builder()
                .data(entity.getData())
                .hora(entity.getHora())
                .saidaRetorno(entity.getSaidaRetorno())
                .placa(entity.getPlaca())
                .motorista(entity.getMotorista())
                .kmVeiculo(entity.getKmVeiculo())
                .tracao(entity.getTracao())
                .rodoar(entity.getRodoar())
                .calibragemPneus(entity.getCalibragemPneus())
                .estepe(entity.getEstepe())
                .freioDianteiro(entity.getFreioDianteiro())
                .freioTraseiro(entity.getFreioTraseiro())
                .amortecedor(entity.getAmortecedor())
                .molas(entity.getMolas())
                .cambioOleo(entity.getCambioOleo())
                .direcaoOleo(entity.getDirecaoOleo())
                .limpezaRadiadorAgua(entity.getLimpezaRadiadorAgua())
                .oleoMotor(entity.getOleoMotor())
                .retrovisor(entity.getRetrovisor())
                .paraBrisa(entity.getParaBrisa())
                .paraChoqueDianteiro(entity.getParaChoqueDianteiro())
                .paraChoqueTraseiro(entity.getParaChoqueTraseiro())
                .estofamento(entity.getEstofamento())
                .cortinas(entity.getCortinas())
                .cintoDeSeguranca(entity.getCintoDeSeguranca())
                .freioDeEstacionamento(entity.getFreioDeEstacionamento())
                .build();
    }
}
