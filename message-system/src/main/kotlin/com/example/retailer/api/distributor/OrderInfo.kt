package com.example.retailer.api.distributor

import java.io.Serializable
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

/**
 * Уведомление об изменении заказа
 */
@Entity
data class OrderInfo(

    /**
     * Уникальный идентификатор заказа
     *
     * @see com.example.retailer.api.distributor.Item#id
     */
    @Id
    val orderId: String,

    /**
     * Статус заказа:
     *  Created
     *
     */
    @Column
    var status: OrderStatus,

    /**
     * Контрольная сумма
     */
    @Column
    val signature: String,

): Serializable