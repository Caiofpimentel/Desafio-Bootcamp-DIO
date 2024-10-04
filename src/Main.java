import com.caiopimentel.dominio.Bootcamp;
import com.caiopimentel.dominio.Curso;
import com.caiopimentel.dominio.Dev;
import com.caiopimentel.dominio.Mentoria;

import javax.sound.midi.Soundbank;
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

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA developer.");
        bootcamp.setDescricao("Descrição Bootcamp JAVA developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosIncritos());
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-------PROGREDINDO------");
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Caio: " + devCaio.getConteudosConcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXp());

        System.out.println("_____________________");


        Dev devCris = new Dev();
        devCris.setNome("Cris");
        devCris.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cris: " + devCris.getConteudosIncritos());
        devCris.progredir();
        System.out.println("------PROGREDINDO-------");
        System.out.println("Conteúdos Inscritos Cris: " + devCris.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Cris: " + devCris.getConteudosConcluidos());
        System.out.println("XP: " + devCris.calcularTotalXp());
    }
}