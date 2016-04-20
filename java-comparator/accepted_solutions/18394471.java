
class Checker {
    public static Comparator<Player> desc;
    
    public Checker() {
        desc = new Comparator<Player>() {
   
            @Override
            public int compare(Player o1, Player o2) {
                int score = Integer.compare(o2.score, o1.score);
                if(score != 0) return score;
                return o2.name.compareTo(o1.name);
            }
        };
    }
}