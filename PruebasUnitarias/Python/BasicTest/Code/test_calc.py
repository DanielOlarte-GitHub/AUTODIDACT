from calc import suma
import pytest

def test_sum():
    assert suma(2,2) == 4
    assert suma(4,5) == 9
    assert 9 == suma(3,6)


@pytest.mark.parametrize(
    "in1, in2, out",
    [
        (3,2,5),
        (2,3,5),
        (suma(3,2),5,10),
        (3, suma(5,2), 10)

    ]

)
def test_mas(in1, in2, out):
    assert suma(in1, in2) == out