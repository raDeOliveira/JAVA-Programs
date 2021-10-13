
package recursividadecomvetores;

public class RecursividadeComVetores {

    public static void escreveVetor( int []x ){
        for( int i=0; i<x.length; i++ )
            System.out.println( x[i] );
    }
    
    public static void escreveVetorRecursivo( int []x, int i ){
        System.out.println( x[i] );
        if( i != x.length - 1 )
            escreveVetorRecursivo( x, i+1 );
    }
    
    public static void escreveVetorInversa( int []x, int i ){
        if( i < 0 )
            System.out.println();
        else{
            System.out.print( x[i] + " "  );
            escreveVetorInversa( x, i-1 );
        }
    }
    
    public static int contaElemento( int[]v, int i, int elemento){
        if( i >= v.length)
            return 0;
        else
            if( elemento == v[i] )
                return 1 + contaElemento( v, i+1, elemento );
            else
                return contaElemento( v, i+1, elemento );
    }
    
    public static int somaElementos( int[]x, int i ){
        if( i == x.length)
            return 0;
        else
            return x[i] + somaElementos( x, i+1 );
    }
    
    public static void pesquisa( int []x, int i, int n ){
        if( i == x.length )
            System.out.println( n + " nao existe no vetor");
        else{
            if( x[i] == n )
                System.out.println( n + " existe na posicao " + i );
            else
                pesquisa( x, i+1, n );
        }
    }
    
    public static void main(String[] args) {
        
        int []v = { 1, 2, 1, 4, 1, 6, 7 };
        
        escreveVetorRecursivo( v, 0 );
        
        System.out.println("");
        
        escreveVetor( v );
        
        System.out.println("Contagem: " + contaElemento( v, 0, 1 ) );
        
        escreveVetorInversa( v, v.length-1 );
    
        System.out.println( "Soma: " + somaElementos( v, 0 ) );
        
        pesquisa( v, 0, 6 );
        
        pesquisa( v, 0, 8 );
    }
    
}
