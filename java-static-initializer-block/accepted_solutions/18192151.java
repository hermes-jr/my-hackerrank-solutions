
private static boolean flag = true;
private static int B = 0;
private static int H = 0;

static void init() throws Exception{
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();
    if(B <= 0 || H <= 0) {
        throw new Exception("Breadth and height must be positive");
    }
}

static{
    try{
        init();
    }
    catch (Exception e) {
        System.out.println(e);
        System.exit(-1);
    }
}