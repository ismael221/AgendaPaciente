
import java.util.ArrayList;
import java.util.List;

public class ListaConsulta extends Agendamento{
    private static final List<Consulta> lista = new ArrayList<>();
    
    public static List<Consulta> listar(){
        return lista;
    }
    
    public static void adicionar(Consulta consulta){
        lista.add(consulta);
    }
    public void executaMetodo(){
        atualizar();
   }
    
}
