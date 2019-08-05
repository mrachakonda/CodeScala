import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

object SparkReadFile {

  val spark = SparkSession
    .builder
    .appName("Sample")
    .master("local[*]")
    .config("spark.sql.warehouse.dir", "file:///C:/temp")
    .getOrCreate()

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.ERROR)
    import spark.implicits._

    //Read a parquet File
    var inputData = spark.read.parquet("C:/Spark/examples/src/main/resources/users.parquet")
    inputData.printSchema()
    inputData.show()
    //Read a Json File
    inputData = spark.read.json("C:/Spark/examples/src/main/resources/people.json")
    inputData.printSchema()
    inputData.show()
    inputData.select("name").show()
    //Read a csv File
    inputData = spark.read.format("com.databricks.spark.csv")
                    .option("header", "false")
                    .option("inferSchema","true")
                    .load("C:/Users/MRachakonda/Documents/retail_db/order_items")
    /*
      .option("delimiter", ";")
      .option("quoteAll","true")
      .option("inferSchema","false")
      .option("multiLine", true)
      .option("escape", "\"")
    */

    inputData.printSchema()
    inputData.show()
  }
}
