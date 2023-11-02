package Week8;
/*3. Declare multidimensional array and store 5 countries and their capital and print them in
        console.*/
public class Test3 {
    public static void main(String[] args) {

        String[][] countrycapArray = { //// Declare Multidimensional array for country and capital
                {"United Kingdom", "London"},
                {"India", "New Delhi"},
                {"USA", "Washington D.C."},
                {"France", "Paris"},
                {"Germany", "Berlin"}};

        // Using for loop Print the countries and their capitals to the console
        for (int i = 0; i < countrycapArray.length; i++) {
            String country = countrycapArray[i][0];//string variable country
            String capital = countrycapArray[i][1];// string variable capital
            System.out.println("Country: " + country + ", Capital: " + capital);
        }
    }
}