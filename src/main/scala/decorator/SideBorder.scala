package decorator

case class SideBorder(override val display: Display, char: Char) extends Border {
  override def columns: Int = 1 + display.columns + 1

  override def rows: Int = display.rows

  override def rowText(row: Int): String = char + display.rowText(row) + char
}
