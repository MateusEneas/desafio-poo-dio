import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria com os melhores professores");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
