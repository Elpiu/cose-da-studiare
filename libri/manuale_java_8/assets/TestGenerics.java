public class TestGenerics {

    public static void main(String[] args) {
        Podio<Aereo,Treno,Macchina> podio
    }




    public class Auto{
        private String nome;
        public Auto(String nome){
            this.nome= nome;
        }

        @Override
        public String toString() {
            return "Auto{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }
    public class Macchina extends Auto{

        public Macchina(String nome) {
            super(nome);
        }
    }
    public class Treno extends Auto{

        public Treno(String nome) {
            super(nome);
        }
    }
    public class Aereo extends Auto{
        public Aereo(String nome) {
            super(nome);
        }
    }

}
