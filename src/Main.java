import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Java com Orientação a Objeto");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria com os melhores professores");
        mentoria1.setData(LocalDate.now());

      /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Mateus: " + devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("Conteudos concluidos Mateus: " + devMateus.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Mateus: " + devMateus.getConteudosInscritos());
        System.out.println("XP = " + devMateus.calcularTotalXp());


        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("Conteudos Concluidos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("XP = " + devCarlos.calcularTotalXp());


    }
}
