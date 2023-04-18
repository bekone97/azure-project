import com.godel.impl.factorial.Factorial;

module factorial {
    requires api;
    provides com.godel.api.Calculate with Factorial;
}
