import com.godel.impl.fibonacci.Fibonacci;

module fibonacci {
    requires api;
    provides com.godel.api.Calculate with Fibonacci;
}
