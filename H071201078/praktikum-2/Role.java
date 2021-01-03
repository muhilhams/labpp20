class Role {
    public static void main(String[]args){
        int menuIndex =0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0){
            System.out.println("What role you want to see ? ");
            System.out.println("For example, try 'Admin'");
        }else if(args.length == 1){
            System.out.println("1. Super Admin");
            System.out.println("1.1 CRUD  Super Admin");
            System.out.println("1.2 CRUD Admin");
            System.out.println("1.3 CRUD User");
            if (args.length == 2){
                System.out.println("1. Super Admin");
                System.out.println("1.1 CRUD  Super Admin");
                System.out.println("1.2 CRUD Admin");
            }
            if (args.length == 3){
                System.out.println("2. Admin");
                System.out.println("2.1 CRUD Admin");
                System.out.println("2.2 CRUD User");
            }
            if (args.length == 4){
                System.out.println("3. User");
                System.out.println("3.1 View");
                System.out.println("3.2 Edit");
            }else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else{
            System.out.println("Too many argument");
        }
        
    }

}
