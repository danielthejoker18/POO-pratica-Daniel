public class Class {
    public static void main(String[] args) {
        import java.util.Scanner;
        Scanner ler = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];
        for(int = 0; i < 3; i++){
            pessoa[i] = new Pessoa();
            try{
            System.out.println("Entre com o nome da pessoa "+i+1);
            pessoas[i].getNome(ler.nextline());
            }catch(Exception e){
                System.out.println(e);
            }
            ler.nextLine();
        }
    }
    class Pessoa{
        private String nome;
        private int idade;
        private String cpf;

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getIdade() {
                return idade;
            }

            public void setIdade(int idade) {
                this.idade = idade;
            }

            public String getCpf() {
                return cpf;
            }

            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
        
    }
}