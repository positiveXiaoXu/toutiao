# Project introduction
Campus Headline is a multi-platform joint use project. The mobile APP platform mainly includes article recommendation, article search and channel management, personal home page, like-comment-collection, hot search and other functions. The we media platform mainly includes article management, comment management, material management, graphic data, fan portraits and other functions. The admin platform mainly includes user management, real name audit, article management, data statistics, sensitive word management and other functions.

Below here are my java project exercise codes, I would like to share it with everyone, hope that we are able to improve with everyone!

## Project dependent environment
- JDK1.8
- Intellij Idea
- maven-3.6.1
- SpringBoot 2.3.9.RELEASE

## Key technology stacks

Spring Boot + MyBatisPlus + MySQL + Redis + MongoDB + Kafka + Elasticsearch + Spring-Cloud + FastDFS + Hbase

## Project architecture

- toutiao-common

  Common configuration

- toutiao-feign-api

  Feign external interface

- toutiao-model

  pojo, dto

- toutiao-utils

  Common tools

- toutiao-gateway

  Management Gateway project

- toutiao-service

  Manage microservices

- toutiao-test

  Some test cases
