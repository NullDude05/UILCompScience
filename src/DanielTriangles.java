public class DanielTriangles {
    String SteveMartin = "Be so good they can't ignore you. - Steve Martin";
    String SamuelBeckett = "Ever tried? Ever failed? No matter. Try again. Fail again. Fail better. - Samuel Beckett";
    String Muhammedquote = "Impossible is just a big word thrown around by small men who find it easier to live in the world they've been given than to explore the power they have to change it. Impossible is not a fact. It's an opinon. Impossible is not a declaration. It's a dare. Impossible is potential. Impossible is temporary. Impossible is nothing. - Muhammed Ali";

    String[] Quotes = {SteveMartin, SamuelBeckett, Muhammedquote};

    public void quoteTriangle() {
        for (var pick: Quotes) {
            for(int i =0; i < pick.length(); i++) {
                switch (pick) {

                }

                System.out.println(pick + "\n");
            }
        }
    }
}
