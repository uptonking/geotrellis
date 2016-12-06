/*
 * Copyright (c) 2014 Azavea.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

object Version {
  val geotrellis  = "1.0.0-RC3"
  val scala       = "2.11.8"
  val geotools    = "14.4"
  val akka        = "2.4.10"
  val spray       = "1.3.3"
  val sprayJson   = "1.3.2"
  val monocle     = "1.2.2"
  val accumulo    = "1.7.2"
  val cassandra   = "3.1.0"
  val hbase       = "1.2.4"
  val geomesa     = "1.2.5"
  lazy val hadoop = Environment.hadoopVersion
  lazy val spark  = Environment.sparkVersion
}
