import com.godel.impl.rsa.RSA;

module rsa {
    requires api;
    provides com.godel.api.Calculate with RSA;
}
