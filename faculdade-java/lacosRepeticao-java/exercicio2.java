class SomaCem{
    public static void main(String[] args){
        int numero = 0;
        for(int i = 1; i <= 100; i++){
            numero = numero + i;
            System.out.printf("%d + %d = %d\n", numero - i, i, numero);
        }
    }
}