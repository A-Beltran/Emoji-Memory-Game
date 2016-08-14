package azb.emojimemory;

/**
 * Created by antwa_000 on 7/14/2016.
 */
public class IntPair {
        // Ideally, name the class after whatever you're actually using
        // the int pairs *for.*
        final int x;
        final int y;
        IntPair(int x, int y) {this.x=x;this.y=y;}
        // depending on your use case, equals? hashCode?  More methods?


        public boolean equals(IntPair other)
        {
                if(this.x==other.x && this.y==other.y)
                {
                        return true;
                }
                if(this.x==other.y && this.y==other.x)
                {
                        return true;
                }
                else
                {
                        return false;
                }
        }
}

