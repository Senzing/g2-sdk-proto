<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: g2engine.proto

namespace G2engine;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>g2engine.WhyRecordsRequest</code>
 */
class WhyRecordsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string dataSourceCode1 = 1;</code>
     */
    protected $dataSourceCode1 = '';
    /**
     * Generated from protobuf field <code>string recordID1 = 2;</code>
     */
    protected $recordID1 = '';
    /**
     * Generated from protobuf field <code>string dataSourceCode2 = 3;</code>
     */
    protected $dataSourceCode2 = '';
    /**
     * Generated from protobuf field <code>string recordID2 = 4;</code>
     */
    protected $recordID2 = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $dataSourceCode1
     *     @type string $recordID1
     *     @type string $dataSourceCode2
     *     @type string $recordID2
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\G2Engine::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode1 = 1;</code>
     * @return string
     */
    public function getDataSourceCode1()
    {
        return $this->dataSourceCode1;
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode1 = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setDataSourceCode1($var)
    {
        GPBUtil::checkString($var, True);
        $this->dataSourceCode1 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string recordID1 = 2;</code>
     * @return string
     */
    public function getRecordID1()
    {
        return $this->recordID1;
    }

    /**
     * Generated from protobuf field <code>string recordID1 = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRecordID1($var)
    {
        GPBUtil::checkString($var, True);
        $this->recordID1 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode2 = 3;</code>
     * @return string
     */
    public function getDataSourceCode2()
    {
        return $this->dataSourceCode2;
    }

    /**
     * Generated from protobuf field <code>string dataSourceCode2 = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setDataSourceCode2($var)
    {
        GPBUtil::checkString($var, True);
        $this->dataSourceCode2 = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string recordID2 = 4;</code>
     * @return string
     */
    public function getRecordID2()
    {
        return $this->recordID2;
    }

    /**
     * Generated from protobuf field <code>string recordID2 = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setRecordID2($var)
    {
        GPBUtil::checkString($var, True);
        $this->recordID2 = $var;

        return $this;
    }

}

