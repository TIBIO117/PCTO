public class articoli {
    public static void main(String[] args) {
        String strtesto = "cavolini di bruxelles (-25%); fagiolini della nonna (-50%); kitkat fondente (-15%);";
        
        String[] articoli = strtesto.split(";");

        for (String articolo : articoli) {
            articolo = articolo.trim(); 
            if (!articolo.isEmpty()) {
                System.out.println(articolo);
            }
        }
    }
}
