package android.chap1

// expresiveness
data class Artist(
		var id: Long,
		var name: String,
		var url: String,
		var mbid: String)


fun main(args: Array<String>) {
	
	/**
	// null safety
	
	
	// This won't compile. Artist can't be null
	var notNullArtist: Artist = null
	
	// Artist can be null
	var artist: Artist? = null
	
	// Won't compile, artist could be null and we need to deal with that
	artist.print()
	// Will print only if artist != null
	artist?.print()
	
	// Smart cast. We don't need to use safe call operator if we previously
	// checked nullity
	if (artist != null) {
		artist.print()
	}
	
	// Only use it when we are sure it's not null. Will throw an exception otherwise.
	artist!!.print()
	
	// Use Elvis operator to give an alternative in case the object is null.
	val name = artist?.name ?: "empty"
	
	*/
}

