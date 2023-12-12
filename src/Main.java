public class Main {
    public static void main(String[] args) {
        Beer beer = new AlcoholicBeer();
        System.out.println(beer);
    }

    public interface Beer {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Beer{
        public String toString(){
            if (isAlcoholic()){
                return StringStore.alcDrink;
            }else {
                return StringStore.alcFreeDrink;
            }
        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}