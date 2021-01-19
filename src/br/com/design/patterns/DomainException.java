package br.com.design.patterns;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public DomainException(String s) {
        super(s);
    }
}
