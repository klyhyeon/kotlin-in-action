package ch03

//TODO 확장함수란 클래스의 멤버 메서드인 것처럼 호출할 수 있지만 그 클래스의 밖에 선언된 함수다.

//String = 수신 객체 타입         this = 수신 객체
fun String.lastChar(): Char = this.get(this.length - 1)

