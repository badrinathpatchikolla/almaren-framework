package com.github.music.of.the.ainur.almaren.builder.core

import com.github.music.of.the.ainur.almaren.Tree
import com.github.music.of.the.ainur.almaren.builder.Core
import com.github.music.of.the.ainur.almaren.state.core._

private[almaren] trait Main extends Core {
  def sql(sql: String): Option[Tree] =
    Sql(sql)

  def alias(alias:String): Option[Tree] =
    Alias(alias)

  def cache(opType:Boolean = true,tableName:Option[String] = None): Option[Tree] = 
    Cache(opType, tableName)

  def coalesce(size:Int): Option[Tree] =
    Coalesce(size)

  def repartition(size:Int): Option[Tree] =
    Repartition(size)

  def pipe(command:String): Option[Tree] =
    Pipe(command)

  def dsl(dsl:String): Option[Tree] =
    Dsl(dsl)
}
