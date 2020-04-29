package daydaychange.p00443

object StringCompression {
  def compress(chars: Array[Char]): Int = {
    var anchor = 0
    var write = 0
    var read = 0
    while (read < chars.length) {
      if (read + 1 == chars.length || chars(read + 1) != chars(read)) {
        chars(write) = chars(anchor)
        write += 1
        if (read > anchor) for (c <- ("" + (read - anchor + 1)).toCharArray) {
          chars(write) = c
          write += 1
        }
        anchor = read + 1
      }
      read += 1
    }
    write
  }
}
