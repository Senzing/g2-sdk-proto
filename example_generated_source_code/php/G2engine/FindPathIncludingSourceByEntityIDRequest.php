<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2engine.proto

namespace G2engine;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2engine.FindPathIncludingSourceByEntityIDRequest</code>
 */
class FindPathIncludingSourceByEntityIDRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     */
    protected $entityID1 = 0;
    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     */
    protected $entityID2 = 0;
    /**
     * Generated from protobuf field <code>int32 maxDegree = 3;</code>
     */
    protected $maxDegree = 0;
    /**
     * Generated from protobuf field <code>string excludedEntities = 4;</code>
     */
    protected $excludedEntities = '';
    /**
     * Generated from protobuf field <code>string requiredDsrcs = 5;</code>
     */
    protected $requiredDsrcs = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $entityID1
     *     @type int|string $entityID2
     *     @type int $maxDegree
     *     @type string $excludedEntities
     *     @type string $requiredDsrcs
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Engine::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     * @return int|string
     */
    public function getEntityID1()
    {
        return $this->entityID1;
    }

    /**
     * Generated from protobuf field <code>int64 entityID1 = 1;</code>
     * @param int|string $var
     * @return $this
     */
    public function setEntityID1($var)
    {
        GPBUtil::checkInt64($var);
        $this->entityID1 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     * @return int|string
     */
    public function getEntityID2()
    {
        return $this->entityID2;
    }

    /**
     * Generated from protobuf field <code>int64 entityID2 = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setEntityID2($var)
    {
        GPBUtil::checkInt64($var);
        $this->entityID2 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 maxDegree = 3;</code>
     * @return int
     */
    public function getMaxDegree()
    {
        return $this->maxDegree;
    }

    /**
     * Generated from protobuf field <code>int32 maxDegree = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setMaxDegree($var)
    {
        GPBUtil::checkInt32($var);
        $this->maxDegree = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string excludedEntities = 4;</code>
     * @return string
     */
    public function getExcludedEntities()
    {
        return $this->excludedEntities;
    }

    /**
     * Generated from protobuf field <code>string excludedEntities = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setExcludedEntities($var)
    {
        GPBUtil::checkString($var, True);
        $this->excludedEntities = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string requiredDsrcs = 5;</code>
     * @return string
     */
    public function getRequiredDsrcs()
    {
        return $this->requiredDsrcs;
    }

    /**
     * Generated from protobuf field <code>string requiredDsrcs = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setRequiredDsrcs($var)
    {
        GPBUtil::checkString($var, True);
        $this->requiredDsrcs = $var;

        return $this;
    }

}

