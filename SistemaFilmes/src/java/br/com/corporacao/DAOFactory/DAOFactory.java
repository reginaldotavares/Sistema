package br.com.corporacao.DAOFactory;
 import br.com.corporacao.ENUM.NomeBanco;

public class DAOFactory {

    public static DAOFactoryIF createFactory (NomeBanco n){
        if (n == NomeBanco.DAO_BD){
            return new DAOFactoryBD();
        }
        return null;
    }
        
}
