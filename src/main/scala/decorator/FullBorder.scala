package decorator

case class FullBorder(override val display: Display) extends Border {
  override def columns: Int = 1 + display.columns + 1

  override def rows: Int = 1 + display.rows + 1

  override def rowText(row: Int): String = {
    if (row == 0) {
      "+" + makeLine('-', display.columns) + "+"
    } else if (row == display.rows + 1) {
      "+" + makeLine('-', display.columns) + "+"
    } else {
      "|" + display.rowText(row - 1) + "|"
    }
  }

  private def makeLine(char: Char, count: Int): String = {
    val buf = new StringBuffer()
    (0 until count).foreach(_ => buf.append(char))
    buf.toString
  }
}
