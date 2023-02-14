package tamrin1;

import java.util.List;

public class TamrinImpl implements Tamrin{
    @Override
    public List<Compani> seda() {
        return null;
    }

    @Override
    public void saveLink(List<Compani> list) {
        for (Compani compani : list) {
            if (compani.getPass() > 23){
                System.out.println(compani);
            }
        }
    }
}
