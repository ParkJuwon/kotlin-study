package language.chap1

// 타입 검사와 자동 변환 사용
// is 연산자 : 대상이 지정한 타입의 인스턴스 인지 검사
// immutable 로컬 변수나 프로퍼티에 대해 특정 타입인지 검사하면 명시적으로 타입을 변환할 필요가 없다
fun getStringLength(obj : Any) : Int? {
	if(obj is String) {
		// 이 코드 브랜치(branch)에서 `obj` 는 자동적으로 `String 으로 변환`
		return obj.length
	}
	
	// 타입 검사 브랜치 밖에서 `obj` 는 여전히 `Any` 타입
	return null
}

// 또는
fun getStringLength2(obj : Any) : Int? {
	if(obj !is String) return null
	
	// `obj` 는 이 브랜치에서 자동으로 `String` 으로 변환
	return obj.length
}

// 이것도 가능
fun getStringLength3(obj : Any) : Int? {
	// `&&`의 우측에서 자동으로 `String` 변환
	if(obj is String && obj.length > 0)
		return obj.length
	
	return null
}