fun checkFace(score:Int) {
	/*if(score > 80) {
		println("这是一个帅哥")
	} else {
		println("这是一个衰哥")
	}*/
	if(score > 80) println("这是一个帅哥") else println("这是一个衰哥")
}

fun main(args: Array<String>) {
	var score = 99
	checkFace(score)
	score = 60
	checkFace(score)
}