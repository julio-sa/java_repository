
public class CepFormatExample {

    public static void main(String[] args) {
        try {
            String formatCep = formatCep("1234567");
            System.out.println(formatCep);
        } catch (CepIvalidException e) {
            System.out.println("CEP not corresponding CEP Format");
        }
    }

    static String formatCep(String cep) throws CepIvalidException {
        if (cep.length() != 8) {
            throw new CepIvalidException();
        }

        //returns a cep format example
        return "23.765-064";
    }
}
