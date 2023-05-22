from hellogit import operacion

def test_suma():
    assert operacion(2, 3, 1) == 5
    assert operacion(5, 3, 1) == 8
    assert operacion(5, 4, 1) == 9

def test_resta():
    assert operacion(4, 2, 2) == 2
    assert operacion(5, 2, 2) == 3

def test_multiplicacion():
    assert operacion(3, 5, 3) == 15
    assert operacion(1, 5, 3) == 5

def test_division():
    assert operacion(6, 2, 4) == 3
    assert operacion(4, 2, 4) == 2

def test_valor_fuera():
    assert operacion(2, 3, 5) == "Valor fuera"
    assert operacion(1, 4, 7) == "Valor fuera"
