import styled from 'styled-components';
import Select from '../atom/Select';
import Input from '../atom/Input';
import FlexBox from '../atom/FlexBox';
import Wrapper from '../atom/Wrapper';
import { categories, searchOptions } from '../../utils/constants/constants';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faSearch } from '@fortawesome/free-solid-svg-icons';

const TopBar = () => {
  return (
    <Wrapper width='100%' padding='10px'>
      <FlexBox justifyContent='center'>
        <Select
          options={categories.map((category: string, index: number) => {
            return { value: String(index), name: category };
          })}
        />
        <Select
          options={searchOptions.map((option: string, index: number) => {
            return { value: String(index), name: option };
          })}
        />
        <FlexBox alignItems='center' position='relative'>
          <StyledSearchIcon className='search-icon' icon={faSearch} />
          <Input type='text' placeholder='검색어를 입력해주세요' />
        </FlexBox>
      </FlexBox>
    </Wrapper>
  );
};

const StyledSearchIcon = styled(FontAwesomeIcon)`
  position: absolute;
  top: 32%;
  left: 15px;
  color: rgba(0, 0, 0, 0.5);
`;

export default TopBar;
