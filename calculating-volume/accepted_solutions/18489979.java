class Output {
    /*
    private static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        df.setRoundingMode(RoundingMode.CEILING);
        return bd.doubleValue();
    }
    */
    
    public void display(double vol) {
        double roundOff = (double) Math.round(vol * 1000) / 1000;
        System.out.println(String.format("%.3f", roundOff));
    }
}
class Calculate {
    public Output output = new Output();
    private static Scanner in = new Scanner(System.in);
    
    protected void finalize() throws Throwable {
        super.finalize();
        in.close();
    }
    public static Integer getINTVal() throws IOException {
        return in.nextInt();       
    }
    
    public static Double getDoubleVal() throws IOException {
        return in.nextDouble();
    }
        
    public static Calculate get_Vol() {
        return new Calculate();
    }
    
    public <T> double main(T... params) throws NumberFormatException {
        double vol = 0.0;
        for(T x: params) {
            //System.out.println(x);
            if((x instanceof Integer && ((Integer)x).compareTo(0) <= 0 ) || (x instanceof Double && ((Double)x).compareTo(0.0) <= 0 ) ) { throw new NumberFormatException("All the values must be positive"); }
        }
        
        if(params.length == 1 && params[0] instanceof Integer) {
            vol = Math.pow((Integer)params[0], 3);
        }
        else if(params.length == 1 && params[0] instanceof Double) {
            vol = Math.PI * (2.0 / 3.0) * Math.pow((Double)params[0], 3); 
        }
        else if(params.length == 2) {
            vol = Math.PI * Math.pow((Double)params[0], 2) * (Double)params[1];
        }
        else if(params.length == 3) {
            vol = (Integer)params[0] * (Integer)params[1] * (Integer)params[2];
        }
        
        
        /*
        double vol = Math.pow(a, 3);
        double vol = Math.PI * Math.pow(r, 2) * h;
        double vol = a * b * c;
        double vol = Math.PI * (2 / 3) * Math.pow(r, 3);
        */
        return vol;
    }
}