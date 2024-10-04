import com.caiopimentel.dominio.Curso;
import com.caiopimentel.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Curso de JAVA!");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("PYTHON");
        curso2.setDescricao("Curso de PYTHON!");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA.");
        mentoria.setDescricao("Descrição mentoria JAVA.");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}