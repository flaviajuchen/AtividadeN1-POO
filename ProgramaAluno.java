public class ProgramaAluno {
      public static void main(String[] args) {
            Aluno aluno = new Aluno();

            aluno.nome = "Flavia Regina Juchen";
            aluno.semestre = 3;
            aluno.ra = 12345;

            aluno.curso.nome = "Analise e Desenvolvimento de Sistemas";
            aluno.curso.coordenador = "Elizeu";

            System.out.println(
                        aluno.nome);
            System.out.println(
                        aluno.semestre);
            System.out.println(
                        aluno.ra);
            System.out.println(
                        aluno.curso.nome);
            System.out.println(
                        aluno.curso.coordenador);
      }
}