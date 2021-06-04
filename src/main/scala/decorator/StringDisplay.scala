package decorator

case class StringDisplay(string: String) extends Display {
  override def columns: Int = string.getBytes.length

  override def rows: Int = 1

  override def rowText(row: Int): String = if (row == 0) string else ""
}
