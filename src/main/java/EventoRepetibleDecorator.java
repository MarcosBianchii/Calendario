import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class EventoRepetibleDecorator extends EventoRepetible {
    private final EventoRepetible repetible;
    private final LocalDate fecha;

    public EventoRepetibleDecorator(EventoRepetible repetible, LocalDate fecha) {
        super(repetible);
        this.repetible = repetible;
        this.fecha = fecha;
    }

    @Override
    public LocalDateTime getIdTiempo() {
        return fecha.atTime(repetible.inicio.getHour(), repetible.inicio.getMinute());
    }

    @Override
    public String getTitulo() {
        return repetible.getTitulo();
    }

    @Override
    public String getDescripcion() {
        return repetible.getDescripcion();
    }

    @Override
    public void setTitulo(String titulo) {
        repetible.setTitulo(titulo);
    }

    @Override
    public void setDescripcion(String descripcion) {
        repetible.setDescripcion(descripcion);
    }

    @Override
    public void setInicio(LocalDateTime inicio) {
        repetible.setInicio(inicio);
    }

    @Override
    public void setFin(LocalDateTime fin) {
        repetible.setFin(fin);
    }

    @Override
    public void agregarAlarma(Alarma alarma) {
        repetible.agregarAlarma(alarma);
    }

    @Override
    public void agregarAlarmas(List<Alarma> alarmas) {
        repetible.agregarAlarmas(alarmas);
    }

    @Override
    public void borrarAlarma(Alarma alarma) {
        repetible.borrarAlarma(alarma);
    }
}
